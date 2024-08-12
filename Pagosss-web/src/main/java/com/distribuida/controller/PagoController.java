package com.distribuida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.distribuida.dao.PagoDAO;
import com.distribuida.dao.TipoPagoDAO;
@Controller
@RequestMapping("/Pago")
public class PagoController {
	
		
		@Autowired
	    private PagoDAO pagoDAO;

	    @Autowired
	    private TipoPagoDAO tipoPagoDAO;

	    @GetMapping("/principal")
	    public String principal() {
	        return "principal";
	    }

	    @GetMapping("/findAll")
	    public String findAll(ModelMap modelMap) {
	        modelMap.addAttribute("pagos", pagoDAO.findALL());
	        return "listar-pagos";
	    }

	    @GetMapping("/findOne")
	    public String findOne(@RequestParam("idPago") @Nullable Integer idPago, ModelMap modelMap) {
	        modelMap.addAttribute("pago", pagoDAO.findOne(idPago));
	        return "listar-pagocion";
	    }

	    @GetMapping("/findOneTipoPago")
	    public String findOneCliente(@RequestParam("idTipoPago") @Nullable Integer idTipoPago, ModelMap modelMap) {
	        modelMap.addAttribute("TipoPago", tipoPagoDAO.findOne(idTipoPago));
	        return "redirect:/pagocion/principal";
	    }
		
}
