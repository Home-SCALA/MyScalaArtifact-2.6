package app.basePackage

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer

class ConfigureAACDS extends AbstractAnnotationConfigDispatcherServletInitializer {
  
  protected def getServletMappings(): Array[String] = {
    
    return Array("/")
    
  }
   protected def getRootConfigClasses(): Array[Class[_]] = {
     
     return Array(classOf[RootConfigure])
     
     }
  protected def getServletConfigClasses(): Array[Class[_]] = {
    
    return Array(classOf[WebConfigure])
    
    }
}