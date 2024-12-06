package DAWI_MENDOZA_SANCHEZ_JOSE.DesarrollodeAplicacionesWeb.service;


import DAWI_MENDOZA_SANCHEZ_JOSE.DesarrollodeAplicacionesWeb.dto.*;


import java.util.List;

public interface MaintenanceService {


    List<FilmListDto> getAllFilms();


    FilmDetailDto getFilmById(int id);


    FilmEditDto getFilmEditById(int id);

    public void postFilmEditById(int id, FilmEditDto filmEditDto);


    FilmCreateDto getFilmCreate();

    public void postFilmCreate(FilmCreateDto filmCreateDto);


    FilmDeleteDto getFilmDeleteById(int id);

    public void postFilmDeleteById(int id, FilmDeleteDto filmDeleteDto);
}
