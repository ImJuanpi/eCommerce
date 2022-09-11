package mx.com.axity.productservice.services;

import mx.com.axity.productservice.commons.to.MediaTO;

import java.util.List;

public interface IMediaService {
    List<MediaTO> getAll();
    MediaTO getbyid(int id);
}
