package com.psgi.siapweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;

import com.psgi.siapweb.domain.model.TypeDocument;
import com.psgi.siapweb.domain.service.TypeDocumentService;

@Controller
public class TypeDocumentController {

    @Autowired
    private TypeDocumentService typeDocumentService;


    @PostMapping(value="/saveTypeDocument"/* , params="action=saveTypeDocument"*/)
	public String saveTypeDocument(@ModelAttribute TypeDocument td) {
		typeDocumentService.createTypeDocument(td);
		return "redirect:/typedocument";
	}


	@GetMapping("/typedocument")
	public String getAllTypeDocument(Model model) {
		List<TypeDocument> typeDocuments = typeDocumentService.getAllTypeDocuments();
        model.addAttribute("typeDocuments", typeDocuments);
		//typeDocuments.get(0).get
//		ModelAndView m=new ModelAndView();
//		m.setViewName("bookList");
//		m.addObject("book",list);
		return "typedocument";
	}


    /*@GetMapping("/available_books")
	public ModelAndView getAllTypeDocument() {
		List<TypeDocument>list=typeDocumentService.getAllTypeDocuments();
//		ModelAndView m=new ModelAndView();
//		m.setViewName("bookList");
//		m.addObject("book",list);
		return new ModelAndView("bookList","book",list);
	}*/
    
}
