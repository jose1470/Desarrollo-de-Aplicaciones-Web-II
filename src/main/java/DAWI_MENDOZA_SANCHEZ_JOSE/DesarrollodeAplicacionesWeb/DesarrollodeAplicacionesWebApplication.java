package DAWI_MENDOZA_SANCHEZ_JOSE.DesarrollodeAplicacionesWeb;

import DAWI_MENDOZA_SANCHEZ_JOSE.DesarrollodeAplicacionesWeb.entity.Film;
import DAWI_MENDOZA_SANCHEZ_JOSE.DesarrollodeAplicacionesWeb.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class DesarrollodeAplicacionesWebApplication implements CommandLineRunner {

	@Autowired
	FilmRepository filmRepository;


	public static void main(String[] args) {

		SpringApplication.run(DesarrollodeAplicacionesWebApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {


		System.out.println("-----------------------------------------------");
		System.out.println("1era llamada Mysql - INGRESA a la BD");
		System.out.println("-----------------------------------------------");
		Iterable<Film> iterable = filmRepository.findAll();
		iterable.forEach((film) -> {
			String message = String.format("%s:%s", film.getFilmId(), film.getTitle());

			System.out.print(message);

		});

		System.out.println(" ");
		System.out.println("-----------------------------------------------");
		System.out.println("2da llamada cache - Llama a cache de datos");
		System.out.println("-----------------------------------------------");
		Iterable<Film> iterable2 = filmRepository.findAll();
		iterable2.forEach((film) -> {
			String message = String.format("%s:%s", film.getFilmId(), film.getTitle());
			//si le quito el ln a "println" no hace salto de linea
			System.out.print(message);

		});


		System.out.println(" ");
		System.out.println("-----------------------------------------------");
		System.out.println("3da llamda save - APLICO UN MODIFICAR");
		System.out.println("-----------------------------------------------");
		Optional<Film> optional = filmRepository.findById(1);

		optional.ifPresentOrElse(
				(film) -> {
					film.setTitle("BATMAN RETURN 8 - MODI");
					filmRepository.save(film);
				},
				() -> {
					System.out.println("film no encontrado");
				}
		);

		System.out.println(" ");
		System.out.println("-----------------------------------------------");
		System.out.println("4ta llamada Cache - Llamade de datos ACTUALES");
		System.out.println("-----------------------------------------------");
		Iterable<Film> iterable3 = filmRepository.findAll();
		iterable3.forEach((film) -> {
			String message = String.format("%s:%s", film.getFilmId(), film.getTitle());

			System.out.print(message);

		});


	}
}