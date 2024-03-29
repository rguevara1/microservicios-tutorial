package com.usuario.service.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.usuario.service.modelos.Moto;

@FeignClient(name="moto-servise",url="http://localhost:8004")
@RequestMapping("/moto")
public interface MotoFeignClient {
	
	@PostMapping()
	public Moto save(@RequestBody Moto moto);
	
	@GetMapping("usuario/{usuaroId}")
	public List<Moto> getMotos(@PathVariable("usuarioId") int usuarioId);

}
