
/*******************************************************************************
Title: Exception - Trabalho da Infnet - JAVA                                                                
Description: Classe responsável pelo tratamento da exception.
                                                                                
The MIT License                                                                 
                                                                                
Copyright: Copyright (C) 2021 Software Pro - Chrystian Cavalcante                                          
                                                                                
Permission is hereby granted, free of charge, to any person                     
obtaining a copy of this software and associated documentation                  
files (the "Software"), to deal in the Software without                         
restriction, including without limitation the rights to use,                    
copy, modify, merge, publish, distribute, sublicense, and/or sell               
copies of the Software, and to permit persons to whom the                       
Software is furnished to do so, subject to the following                        
conditions:                                                                     
                                                                                
The above copyright notice and this permission notice shall be                  
included in all copies or substantial portions of the Software.                 
                                                                                
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,                 
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES                 
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND                        
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT                     
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,                    
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING                    
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR                   
OTHER DEALINGS IN THE SOFTWARE.                                                 
                                                                                
       The author may be contacted at:                                          
           br3wchrystian@gmail.com                                                   
                                                                                
@author Chrystian Cavalcante (br3wchrystian@gmail.com)                    
@version 1.0.0
*******************************************************************************/

import org.springframework.security.core.AuthenticationException;

public class FalhaAutenticacaoException extends AuthenticationException {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public FalhaAutenticacaoException(String msg) {
    super(msg);
    // TODO Auto-generated constructor stub
  }

}