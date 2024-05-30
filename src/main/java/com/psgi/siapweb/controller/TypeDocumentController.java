package com.psgi.siapweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;

import com.psgi.siapweb.domain.model.TypeDocument;
import com.psgi.siapweb.domain.service.TypeDocumentService;

@Controller
public class TypeDocumentController {

    @Autowired
    private TypeDocumentService typeDocumentService;

	
    @PostMapping(value="/saveTypeDocument"/* , params="action=saveTypeDocument"*/)
	public String saveTypeDocument(@ModelAttribute("typeDocument") TypeDocument typeDocument) { // Nombre de typeDocument como referencia
		typeDocumentService.createTypeDocument(typeDocument);
		return "typedocument";
	}
	

	@GetMapping("/typedocument")
	public String getAllTypeDocument(Model model) {
		List<TypeDocument> typeDocuments = typeDocumentService.getAllTypeDocuments();

		model.addAttribute("typeDocument", new TypeDocument());
        model.addAttribute("typeDocuments", typeDocuments);
		//typeDocuments.get(0).get
//		ModelAndView m=new ModelAndView();
//		m.setViewName("bookList");
//		m.addObject("book",list);
		return "typedocument";
	}


	@GetMapping("/editTypeDocument/{id}"/* , params="action=saveTypeDocument"*/)
	public String editypeDocument(@PathVariable  int id ,Model model/* , @ModelAttribute("typeDocument") TypeDocument typeDocumentData*/) { // Nombre de typeDocument como referencia
		
		
		//TypeDocument typeDocument=typeDocumentService.editTypeDocumentById(id_documento,typeDocumentData);

		TypeDocument typeDocument=typeDocumentService.getTypeDocumentById(id);
		model.addAttribute("typeDocument", typeDocument);
		return "typedocument_copy";
	}
	

	@PostMapping("/editSaveTypeDocument/{id}"/* , params="action=saveTypeDocument"*/)
	public String editypeDocumentSave(@PathVariable  int id , @ModelAttribute("typeDocument") TypeDocument typeDocumentData) { // Nombre de typeDocument como referencia
		
		
		typeDocumentService.editTypeDocumentById(id,typeDocumentData);

		//TypeDocument typeDocument=typeDocumentService.getTypeDocumentById(id);
		//model.addAttribute("typeDocument", typeDocument);
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
