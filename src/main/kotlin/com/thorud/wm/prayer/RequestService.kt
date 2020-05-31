package com.thorud.wm.prayer

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class RequestService {
  
  fun getRequest(name: String) = "Praying for $name"

}