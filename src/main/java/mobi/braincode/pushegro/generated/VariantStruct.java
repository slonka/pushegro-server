/**
 * VariantStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mobi.braincode.pushegro.generated;

public class VariantStruct  implements java.io.Serializable {
    private int fid;

    private mobi.braincode.pushegro.generated.VariantQuantityStruct[] quantities;

    public VariantStruct() {
    }

    public VariantStruct(
           int fid,
           mobi.braincode.pushegro.generated.VariantQuantityStruct[] quantities) {
           this.fid = fid;
           this.quantities = quantities;
    }


    /**
     * Gets the fid value for this VariantStruct.
     * 
     * @return fid
     */
    public int getFid() {
        return fid;
    }


    /**
     * Sets the fid value for this VariantStruct.
     * 
     * @param fid
     */
    public void setFid(int fid) {
        this.fid = fid;
    }


    /**
     * Gets the quantities value for this VariantStruct.
     * 
     * @return quantities
     */
    public mobi.braincode.pushegro.generated.VariantQuantityStruct[] getQuantities() {
        return quantities;
    }


    /**
     * Sets the quantities value for this VariantStruct.
     * 
     * @param quantities
     */
    public void setQuantities(mobi.braincode.pushegro.generated.VariantQuantityStruct[] quantities) {
        this.quantities = quantities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VariantStruct)) return false;
        VariantStruct other = (VariantStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.fid == other.getFid() &&
            ((this.quantities==null && other.getQuantities()==null) || 
             (this.quantities!=null &&
              java.util.Arrays.equals(this.quantities, other.getQuantities())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getFid();
        if (getQuantities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VariantStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "VariantStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "VariantQuantityStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
