// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: airQuality.proto

package airQualityService;

/**
 * Protobuf type {@code airQuality.requestQuality}
 */
public  final class requestQuality extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:airQuality.requestQuality)
    requestQualityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use requestQuality.newBuilder() to construct.
  private requestQuality(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private requestQuality() {
    country_ = "";
    city_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private requestQuality(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            country_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            city_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return airQualityService.airQualityServiceImpl.internal_static_airQuality_requestQuality_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return airQualityService.airQualityServiceImpl.internal_static_airQuality_requestQuality_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            airQualityService.requestQuality.class, airQualityService.requestQuality.Builder.class);
  }

  public static final int COUNTRY_FIELD_NUMBER = 1;
  private volatile java.lang.Object country_;
  /**
   * <pre>
   * setCountry(), getCountry()
   * </pre>
   *
   * <code>string country = 1;</code>
   */
  public java.lang.String getCountry() {
    java.lang.Object ref = country_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      country_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * setCountry(), getCountry()
   * </pre>
   *
   * <code>string country = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCountryBytes() {
    java.lang.Object ref = country_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      country_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CITY_FIELD_NUMBER = 2;
  private volatile java.lang.Object city_;
  /**
   * <pre>
   * setCity(), getCity()
   * </pre>
   *
   * <code>string city = 2;</code>
   */
  public java.lang.String getCity() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      city_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * setCity(), getCity()
   * </pre>
   *
   * <code>string city = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCityBytes() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      city_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getCountryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, country_);
    }
    if (!getCityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, city_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCountryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, country_);
    }
    if (!getCityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, city_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof airQualityService.requestQuality)) {
      return super.equals(obj);
    }
    airQualityService.requestQuality other = (airQualityService.requestQuality) obj;

    boolean result = true;
    result = result && getCountry()
        .equals(other.getCountry());
    result = result && getCity()
        .equals(other.getCity());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COUNTRY_FIELD_NUMBER;
    hash = (53 * hash) + getCountry().hashCode();
    hash = (37 * hash) + CITY_FIELD_NUMBER;
    hash = (53 * hash) + getCity().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static airQualityService.requestQuality parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static airQualityService.requestQuality parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static airQualityService.requestQuality parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static airQualityService.requestQuality parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static airQualityService.requestQuality parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static airQualityService.requestQuality parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static airQualityService.requestQuality parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static airQualityService.requestQuality parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static airQualityService.requestQuality parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static airQualityService.requestQuality parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static airQualityService.requestQuality parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static airQualityService.requestQuality parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(airQualityService.requestQuality prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code airQuality.requestQuality}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:airQuality.requestQuality)
      airQualityService.requestQualityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return airQualityService.airQualityServiceImpl.internal_static_airQuality_requestQuality_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return airQualityService.airQualityServiceImpl.internal_static_airQuality_requestQuality_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              airQualityService.requestQuality.class, airQualityService.requestQuality.Builder.class);
    }

    // Construct using airQualityService.requestQuality.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      country_ = "";

      city_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return airQualityService.airQualityServiceImpl.internal_static_airQuality_requestQuality_descriptor;
    }

    @java.lang.Override
    public airQualityService.requestQuality getDefaultInstanceForType() {
      return airQualityService.requestQuality.getDefaultInstance();
    }

    @java.lang.Override
    public airQualityService.requestQuality build() {
      airQualityService.requestQuality result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public airQualityService.requestQuality buildPartial() {
      airQualityService.requestQuality result = new airQualityService.requestQuality(this);
      result.country_ = country_;
      result.city_ = city_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof airQualityService.requestQuality) {
        return mergeFrom((airQualityService.requestQuality)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(airQualityService.requestQuality other) {
      if (other == airQualityService.requestQuality.getDefaultInstance()) return this;
      if (!other.getCountry().isEmpty()) {
        country_ = other.country_;
        onChanged();
      }
      if (!other.getCity().isEmpty()) {
        city_ = other.city_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      airQualityService.requestQuality parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (airQualityService.requestQuality) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object country_ = "";
    /**
     * <pre>
     * setCountry(), getCountry()
     * </pre>
     *
     * <code>string country = 1;</code>
     */
    public java.lang.String getCountry() {
      java.lang.Object ref = country_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        country_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * setCountry(), getCountry()
     * </pre>
     *
     * <code>string country = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCountryBytes() {
      java.lang.Object ref = country_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        country_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * setCountry(), getCountry()
     * </pre>
     *
     * <code>string country = 1;</code>
     */
    public Builder setCountry(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      country_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * setCountry(), getCountry()
     * </pre>
     *
     * <code>string country = 1;</code>
     */
    public Builder clearCountry() {
      
      country_ = getDefaultInstance().getCountry();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * setCountry(), getCountry()
     * </pre>
     *
     * <code>string country = 1;</code>
     */
    public Builder setCountryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      country_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object city_ = "";
    /**
     * <pre>
     * setCity(), getCity()
     * </pre>
     *
     * <code>string city = 2;</code>
     */
    public java.lang.String getCity() {
      java.lang.Object ref = city_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        city_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * setCity(), getCity()
     * </pre>
     *
     * <code>string city = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCityBytes() {
      java.lang.Object ref = city_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        city_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * setCity(), getCity()
     * </pre>
     *
     * <code>string city = 2;</code>
     */
    public Builder setCity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      city_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * setCity(), getCity()
     * </pre>
     *
     * <code>string city = 2;</code>
     */
    public Builder clearCity() {
      
      city_ = getDefaultInstance().getCity();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * setCity(), getCity()
     * </pre>
     *
     * <code>string city = 2;</code>
     */
    public Builder setCityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      city_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:airQuality.requestQuality)
  }

  // @@protoc_insertion_point(class_scope:airQuality.requestQuality)
  private static final airQualityService.requestQuality DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new airQualityService.requestQuality();
  }

  public static airQualityService.requestQuality getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<requestQuality>
      PARSER = new com.google.protobuf.AbstractParser<requestQuality>() {
    @java.lang.Override
    public requestQuality parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new requestQuality(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<requestQuality> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<requestQuality> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public airQualityService.requestQuality getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

