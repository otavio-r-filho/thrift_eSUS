/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FichaAtendimentoIndividualMasterThrift implements org.apache.thrift.TBase<FichaAtendimentoIndividualMasterThrift, FichaAtendimentoIndividualMasterThrift._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FichaAtendimentoIndividualMasterThrift");

  private static final org.apache.thrift.protocol.TField HEADER_TRANSPORT_FIELD_DESC = new org.apache.thrift.protocol.TField("headerTransport", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ATENDIMENTOS_INDIVIDUAIS_FIELD_DESC = new org.apache.thrift.protocol.TField("atendimentosIndividuais", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField UUID_FICHA_FIELD_DESC = new org.apache.thrift.protocol.TField("uuidFicha", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TP_CDS_ORIGEM_FIELD_DESC = new org.apache.thrift.protocol.TField("tpCdsOrigem", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FichaAtendimentoIndividualMasterThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FichaAtendimentoIndividualMasterThriftTupleSchemeFactory());
  }

  private br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift headerTransport; // required
  private List<FichaAtendimentoIndividualChildThrift> atendimentosIndividuais; // optional
  private String uuidFicha; // required
  private int tpCdsOrigem; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER_TRANSPORT((short)1, "headerTransport"),
    ATENDIMENTOS_INDIVIDUAIS((short)2, "atendimentosIndividuais"),
    UUID_FICHA((short)3, "uuidFicha"),
    TP_CDS_ORIGEM((short)4, "tpCdsOrigem");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HEADER_TRANSPORT
          return HEADER_TRANSPORT;
        case 2: // ATENDIMENTOS_INDIVIDUAIS
          return ATENDIMENTOS_INDIVIDUAIS;
        case 3: // UUID_FICHA
          return UUID_FICHA;
        case 4: // TP_CDS_ORIGEM
          return TP_CDS_ORIGEM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TPCDSORIGEM_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.ATENDIMENTOS_INDIVIDUAIS,_Fields.TP_CDS_ORIGEM};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER_TRANSPORT, new org.apache.thrift.meta_data.FieldMetaData("headerTransport", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift.class)));
    tmpMap.put(_Fields.ATENDIMENTOS_INDIVIDUAIS, new org.apache.thrift.meta_data.FieldMetaData("atendimentosIndividuais", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FichaAtendimentoIndividualChildThrift.class))));
    tmpMap.put(_Fields.UUID_FICHA, new org.apache.thrift.meta_data.FieldMetaData("uuidFicha", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TP_CDS_ORIGEM, new org.apache.thrift.meta_data.FieldMetaData("tpCdsOrigem", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FichaAtendimentoIndividualMasterThrift.class, metaDataMap);
  }

  public FichaAtendimentoIndividualMasterThrift() {
  }

  public FichaAtendimentoIndividualMasterThrift(
    br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift headerTransport,
    String uuidFicha)
  {
    this();
    this.headerTransport = headerTransport;
    this.uuidFicha = uuidFicha;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FichaAtendimentoIndividualMasterThrift(FichaAtendimentoIndividualMasterThrift other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHeaderTransport()) {
      this.headerTransport = new br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift(other.headerTransport);
    }
    if (other.isSetAtendimentosIndividuais()) {
      List<FichaAtendimentoIndividualChildThrift> __this__atendimentosIndividuais = new ArrayList<FichaAtendimentoIndividualChildThrift>();
      for (FichaAtendimentoIndividualChildThrift other_element : other.atendimentosIndividuais) {
        __this__atendimentosIndividuais.add(new FichaAtendimentoIndividualChildThrift(other_element));
      }
      this.atendimentosIndividuais = __this__atendimentosIndividuais;
    }
    if (other.isSetUuidFicha()) {
      this.uuidFicha = other.uuidFicha;
    }
    this.tpCdsOrigem = other.tpCdsOrigem;
  }

  public FichaAtendimentoIndividualMasterThrift deepCopy() {
    return new FichaAtendimentoIndividualMasterThrift(this);
  }

  @Override
  public void clear() {
    this.headerTransport = null;
    this.atendimentosIndividuais = null;
    this.uuidFicha = null;
    setTpCdsOrigemIsSet(false);
    this.tpCdsOrigem = 0;
  }

  public br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift getHeaderTransport() {
    return this.headerTransport;
  }

  public void setHeaderTransport(br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift headerTransport) {
    this.headerTransport = headerTransport;
  }

  public void unsetHeaderTransport() {
    this.headerTransport = null;
  }

  /** Returns true if field headerTransport is set (has been assigned a value) and false otherwise */
  public boolean isSetHeaderTransport() {
    return this.headerTransport != null;
  }

  public void setHeaderTransportIsSet(boolean value) {
    if (!value) {
      this.headerTransport = null;
    }
  }

  public int getAtendimentosIndividuaisSize() {
    return (this.atendimentosIndividuais == null) ? 0 : this.atendimentosIndividuais.size();
  }

  public java.util.Iterator<FichaAtendimentoIndividualChildThrift> getAtendimentosIndividuaisIterator() {
    return (this.atendimentosIndividuais == null) ? null : this.atendimentosIndividuais.iterator();
  }

  public void addToAtendimentosIndividuais(FichaAtendimentoIndividualChildThrift elem) {
    if (this.atendimentosIndividuais == null) {
      this.atendimentosIndividuais = new ArrayList<FichaAtendimentoIndividualChildThrift>();
    }
    this.atendimentosIndividuais.add(elem);
  }

  public List<FichaAtendimentoIndividualChildThrift> getAtendimentosIndividuais() {
    return this.atendimentosIndividuais;
  }

  public void setAtendimentosIndividuais(List<FichaAtendimentoIndividualChildThrift> atendimentosIndividuais) {
    this.atendimentosIndividuais = atendimentosIndividuais;
  }

  public void unsetAtendimentosIndividuais() {
    this.atendimentosIndividuais = null;
  }

  /** Returns true if field atendimentosIndividuais is set (has been assigned a value) and false otherwise */
  public boolean isSetAtendimentosIndividuais() {
    return this.atendimentosIndividuais != null;
  }

  public void setAtendimentosIndividuaisIsSet(boolean value) {
    if (!value) {
      this.atendimentosIndividuais = null;
    }
  }

  public String getUuidFicha() {
    return this.uuidFicha;
  }

  public void setUuidFicha(String uuidFicha) {
    this.uuidFicha = uuidFicha;
  }

  public void unsetUuidFicha() {
    this.uuidFicha = null;
  }

  /** Returns true if field uuidFicha is set (has been assigned a value) and false otherwise */
  public boolean isSetUuidFicha() {
    return this.uuidFicha != null;
  }

  public void setUuidFichaIsSet(boolean value) {
    if (!value) {
      this.uuidFicha = null;
    }
  }

  public int getTpCdsOrigem() {
    return this.tpCdsOrigem;
  }

  public void setTpCdsOrigem(int tpCdsOrigem) {
    this.tpCdsOrigem = tpCdsOrigem;
    setTpCdsOrigemIsSet(true);
  }

  public void unsetTpCdsOrigem() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TPCDSORIGEM_ISSET_ID);
  }

  /** Returns true if field tpCdsOrigem is set (has been assigned a value) and false otherwise */
  public boolean isSetTpCdsOrigem() {
    return EncodingUtils.testBit(__isset_bitfield, __TPCDSORIGEM_ISSET_ID);
  }

  public void setTpCdsOrigemIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TPCDSORIGEM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEADER_TRANSPORT:
      if (value == null) {
        unsetHeaderTransport();
      } else {
        setHeaderTransport((br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift)value);
      }
      break;

    case ATENDIMENTOS_INDIVIDUAIS:
      if (value == null) {
        unsetAtendimentosIndividuais();
      } else {
        setAtendimentosIndividuais((List<FichaAtendimentoIndividualChildThrift>)value);
      }
      break;

    case UUID_FICHA:
      if (value == null) {
        unsetUuidFicha();
      } else {
        setUuidFicha((String)value);
      }
      break;

    case TP_CDS_ORIGEM:
      if (value == null) {
        unsetTpCdsOrigem();
      } else {
        setTpCdsOrigem((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER_TRANSPORT:
      return getHeaderTransport();

    case ATENDIMENTOS_INDIVIDUAIS:
      return getAtendimentosIndividuais();

    case UUID_FICHA:
      return getUuidFicha();

    case TP_CDS_ORIGEM:
      return Integer.valueOf(getTpCdsOrigem());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HEADER_TRANSPORT:
      return isSetHeaderTransport();
    case ATENDIMENTOS_INDIVIDUAIS:
      return isSetAtendimentosIndividuais();
    case UUID_FICHA:
      return isSetUuidFicha();
    case TP_CDS_ORIGEM:
      return isSetTpCdsOrigem();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FichaAtendimentoIndividualMasterThrift)
      return this.equals((FichaAtendimentoIndividualMasterThrift)that);
    return false;
  }

  public boolean equals(FichaAtendimentoIndividualMasterThrift that) {
    if (that == null)
      return false;

    boolean this_present_headerTransport = true && this.isSetHeaderTransport();
    boolean that_present_headerTransport = true && that.isSetHeaderTransport();
    if (this_present_headerTransport || that_present_headerTransport) {
      if (!(this_present_headerTransport && that_present_headerTransport))
        return false;
      if (!this.headerTransport.equals(that.headerTransport))
        return false;
    }

    boolean this_present_atendimentosIndividuais = true && this.isSetAtendimentosIndividuais();
    boolean that_present_atendimentosIndividuais = true && that.isSetAtendimentosIndividuais();
    if (this_present_atendimentosIndividuais || that_present_atendimentosIndividuais) {
      if (!(this_present_atendimentosIndividuais && that_present_atendimentosIndividuais))
        return false;
      if (!this.atendimentosIndividuais.equals(that.atendimentosIndividuais))
        return false;
    }

    boolean this_present_uuidFicha = true && this.isSetUuidFicha();
    boolean that_present_uuidFicha = true && that.isSetUuidFicha();
    if (this_present_uuidFicha || that_present_uuidFicha) {
      if (!(this_present_uuidFicha && that_present_uuidFicha))
        return false;
      if (!this.uuidFicha.equals(that.uuidFicha))
        return false;
    }

    boolean this_present_tpCdsOrigem = true && this.isSetTpCdsOrigem();
    boolean that_present_tpCdsOrigem = true && that.isSetTpCdsOrigem();
    if (this_present_tpCdsOrigem || that_present_tpCdsOrigem) {
      if (!(this_present_tpCdsOrigem && that_present_tpCdsOrigem))
        return false;
      if (this.tpCdsOrigem != that.tpCdsOrigem)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(FichaAtendimentoIndividualMasterThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    FichaAtendimentoIndividualMasterThrift typedOther = (FichaAtendimentoIndividualMasterThrift)other;

    lastComparison = Boolean.valueOf(isSetHeaderTransport()).compareTo(typedOther.isSetHeaderTransport());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeaderTransport()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.headerTransport, typedOther.headerTransport);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAtendimentosIndividuais()).compareTo(typedOther.isSetAtendimentosIndividuais());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAtendimentosIndividuais()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.atendimentosIndividuais, typedOther.atendimentosIndividuais);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUuidFicha()).compareTo(typedOther.isSetUuidFicha());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUuidFicha()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uuidFicha, typedOther.uuidFicha);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTpCdsOrigem()).compareTo(typedOther.isSetTpCdsOrigem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTpCdsOrigem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tpCdsOrigem, typedOther.tpCdsOrigem);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("FichaAtendimentoIndividualMasterThrift(");
    boolean first = true;

    sb.append("headerTransport:");
    if (this.headerTransport == null) {
      sb.append("null");
    } else {
      sb.append(this.headerTransport);
    }
    first = false;
    if (isSetAtendimentosIndividuais()) {
      if (!first) sb.append(", ");
      sb.append("atendimentosIndividuais:");
      if (this.atendimentosIndividuais == null) {
        sb.append("null");
      } else {
        sb.append(this.atendimentosIndividuais);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("uuidFicha:");
    if (this.uuidFicha == null) {
      sb.append("null");
    } else {
      sb.append(this.uuidFicha);
    }
    first = false;
    if (isSetTpCdsOrigem()) {
      if (!first) sb.append(", ");
      sb.append("tpCdsOrigem:");
      sb.append(this.tpCdsOrigem);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetHeaderTransport()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'headerTransport' is unset! Struct:" + toString());
    }

    if (!isSetUuidFicha()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'uuidFicha' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (headerTransport != null) {
      headerTransport.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FichaAtendimentoIndividualMasterThriftStandardSchemeFactory implements SchemeFactory {
    public FichaAtendimentoIndividualMasterThriftStandardScheme getScheme() {
      return new FichaAtendimentoIndividualMasterThriftStandardScheme();
    }
  }

  private static class FichaAtendimentoIndividualMasterThriftStandardScheme extends StandardScheme<FichaAtendimentoIndividualMasterThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FichaAtendimentoIndividualMasterThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HEADER_TRANSPORT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.headerTransport = new br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift();
              struct.headerTransport.read(iprot);
              struct.setHeaderTransportIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ATENDIMENTOS_INDIVIDUAIS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list56 = iprot.readListBegin();
                struct.atendimentosIndividuais = new ArrayList<FichaAtendimentoIndividualChildThrift>(_list56.size);
                for (int _i57 = 0; _i57 < _list56.size; ++_i57)
                {
                  FichaAtendimentoIndividualChildThrift _elem58; // required
                  _elem58 = new FichaAtendimentoIndividualChildThrift();
                  _elem58.read(iprot);
                  struct.atendimentosIndividuais.add(_elem58);
                }
                iprot.readListEnd();
              }
              struct.setAtendimentosIndividuaisIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UUID_FICHA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uuidFicha = iprot.readString();
              struct.setUuidFichaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TP_CDS_ORIGEM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tpCdsOrigem = iprot.readI32();
              struct.setTpCdsOrigemIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, FichaAtendimentoIndividualMasterThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.headerTransport != null) {
        oprot.writeFieldBegin(HEADER_TRANSPORT_FIELD_DESC);
        struct.headerTransport.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.atendimentosIndividuais != null) {
        if (struct.isSetAtendimentosIndividuais()) {
          oprot.writeFieldBegin(ATENDIMENTOS_INDIVIDUAIS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.atendimentosIndividuais.size()));
            for (FichaAtendimentoIndividualChildThrift _iter59 : struct.atendimentosIndividuais)
            {
              _iter59.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.uuidFicha != null) {
        oprot.writeFieldBegin(UUID_FICHA_FIELD_DESC);
        oprot.writeString(struct.uuidFicha);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTpCdsOrigem()) {
        oprot.writeFieldBegin(TP_CDS_ORIGEM_FIELD_DESC);
        oprot.writeI32(struct.tpCdsOrigem);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FichaAtendimentoIndividualMasterThriftTupleSchemeFactory implements SchemeFactory {
    public FichaAtendimentoIndividualMasterThriftTupleScheme getScheme() {
      return new FichaAtendimentoIndividualMasterThriftTupleScheme();
    }
  }

  private static class FichaAtendimentoIndividualMasterThriftTupleScheme extends TupleScheme<FichaAtendimentoIndividualMasterThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FichaAtendimentoIndividualMasterThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.headerTransport.write(oprot);
      oprot.writeString(struct.uuidFicha);
      BitSet optionals = new BitSet();
      if (struct.isSetAtendimentosIndividuais()) {
        optionals.set(0);
      }
      if (struct.isSetTpCdsOrigem()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAtendimentosIndividuais()) {
        {
          oprot.writeI32(struct.atendimentosIndividuais.size());
          for (FichaAtendimentoIndividualChildThrift _iter60 : struct.atendimentosIndividuais)
          {
            _iter60.write(oprot);
          }
        }
      }
      if (struct.isSetTpCdsOrigem()) {
        oprot.writeI32(struct.tpCdsOrigem);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FichaAtendimentoIndividualMasterThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.headerTransport = new br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift();
      struct.headerTransport.read(iprot);
      struct.setHeaderTransportIsSet(true);
      struct.uuidFicha = iprot.readString();
      struct.setUuidFichaIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list61 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.atendimentosIndividuais = new ArrayList<FichaAtendimentoIndividualChildThrift>(_list61.size);
          for (int _i62 = 0; _i62 < _list61.size; ++_i62)
          {
            FichaAtendimentoIndividualChildThrift _elem63; // required
            _elem63 = new FichaAtendimentoIndividualChildThrift();
            _elem63.read(iprot);
            struct.atendimentosIndividuais.add(_elem63);
          }
        }
        struct.setAtendimentosIndividuaisIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tpCdsOrigem = iprot.readI32();
        struct.setTpCdsOrigemIsSet(true);
      }
    }
  }

}
