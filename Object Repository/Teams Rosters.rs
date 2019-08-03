<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Ful Team Rosters 2019 2020</description>
   <name>Teams Rosters</name>
   <tag></tag>
   <elementGuidId>e6606bae-6c56-48a9-9f66-70487724a8e9</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>http://statsapi.web.nhl.com/api/v1/teams/26?expand=team.roster&amp;season=20192020</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

assertThat(response.getResponseText()).contains('Los Angeles Kings')

assertThat(response.getResponseText()).contains('STAPLES Center')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
