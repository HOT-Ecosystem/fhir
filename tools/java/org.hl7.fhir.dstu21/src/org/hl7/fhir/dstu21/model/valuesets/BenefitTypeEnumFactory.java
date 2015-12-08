package org.hl7.fhir.dstu21.model.valuesets;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Tue, Dec 8, 2015 15:43+1100 for FHIR v1.1.0


import org.hl7.fhir.dstu21.model.EnumFactory;

public class BenefitTypeEnumFactory implements EnumFactory<BenefitType> {

  public BenefitType fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("deductable".equals(codeString))
      return BenefitType.DEDUCTABLE;
    if ("visit".equals(codeString))
      return BenefitType.VISIT;
    if ("copay".equals(codeString))
      return BenefitType.COPAY;
    if ("vision-exam".equals(codeString))
      return BenefitType.VISIONEXAM;
    if ("vision-glasses".equals(codeString))
      return BenefitType.VISIONGLASSES;
    if ("vision-contacts".equals(codeString))
      return BenefitType.VISIONCONTACTS;
    if ("medical-primarycare".equals(codeString))
      return BenefitType.MEDICALPRIMARYCARE;
    if ("pharmacy-dispense".equals(codeString))
      return BenefitType.PHARMACYDISPENSE;
    throw new IllegalArgumentException("Unknown BenefitType code '"+codeString+"'");
  }

  public String toCode(BenefitType code) {
    if (code == BenefitType.DEDUCTABLE)
      return "deductable";
    if (code == BenefitType.VISIT)
      return "visit";
    if (code == BenefitType.COPAY)
      return "copay";
    if (code == BenefitType.VISIONEXAM)
      return "vision-exam";
    if (code == BenefitType.VISIONGLASSES)
      return "vision-glasses";
    if (code == BenefitType.VISIONCONTACTS)
      return "vision-contacts";
    if (code == BenefitType.MEDICALPRIMARYCARE)
      return "medical-primarycare";
    if (code == BenefitType.PHARMACYDISPENSE)
      return "pharmacy-dispense";
    return "?";
  }


}

