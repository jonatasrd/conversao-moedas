package com.casadamoeda.conversaomoedas.infra.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.casadamoeda.conversaomoedas.bean.CurrencyConversionBean;

//@FeignClient(name="forex-service", url="localhost:8100") - Declares that this is a Feign Client and the url at which forex-service is present is localhost:8100
@FeignClient(name="servico-valor-moedas")
@RibbonClient(name="servico-valor-moedas")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
	
}
