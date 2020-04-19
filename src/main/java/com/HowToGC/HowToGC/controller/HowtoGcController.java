/**
 * 
 */
package com.HowToGC.HowToGC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dnaramala
 *
 */
@RestController
@RequestMapping("/howto")
public class HowtoGcController {
@GetMapping("/test")
public String testHowTo() {
	return "How to Deploy in GC Working with YML with V2";
}
}
