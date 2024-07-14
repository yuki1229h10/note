package com.example.webapp.utility;

import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.springframework.security.core.SpringSecurityCoreVersion;

public class SpringVersionCheck {
	public static void main(String[] args) {
		String springVersion = SpringVersion.getVersion();
		System.out.println("Spring Frameworkのバージョン: " + springVersion);
		String bootVersion = SpringBootVersion.getVersion();
		System.out.println("Spring Bootのバージョン: " + bootVersion);
		String securityVersion = SpringSecurityCoreVersion.getVersion();
		System.out.println("Spring Securityのバージョン: " + securityVersion);
	}
}
