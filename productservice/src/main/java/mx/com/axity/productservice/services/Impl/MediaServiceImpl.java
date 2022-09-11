package mx.com.axity.productservice.services.Impl;

import mx.com.axity.productservice.commons.to.CategoryTO;
import mx.com.axity.productservice.commons.to.MediaTO;
import mx.com.axity.productservice.model.CategoryDO;
import mx.com.axity.productservice.model.MediaDO;
import mx.com.axity.productservice.persistence.CategoryRepository;
import mx.com.axity.productservice.persistence.MediaRepository;
import mx.com.axity.productservice.services.ICategoryService;
import mx.com.axity.productservice.services.IMediaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MediaServiceImpl implements IMediaService {
    static final Logger LOG = LogManager.getLogger(CategoryHasProductServiceImpl.class);

    @Autowired
    MediaRepository mediaRepository;

    @Override
    public List<MediaTO> getAll() {
        LOG.info("Obteniendo todos los datos ");

        List<MediaDO> mediaDO =  (List<MediaDO>) mediaRepository.findAll();

        return mediaDO.stream()
                .map(this::convertToTO)
                .collect(Collectors.toList());
    }

    @Override
    public MediaTO getbyid(int id){
        LOG.info("Obteniendo valor para el parámetro " + id);

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        MediaDO mediaDO = mediaRepository.findByidMedia(id);
        MediaTO returnValue = modelMapper.map(mediaDO, MediaTO.class);

        return returnValue;
    }

    private MediaTO convertToTO(MediaDO media) {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        MediaTO mediaTO = modelMapper.map(media, MediaTO.class);

        return mediaTO;
    }
}
