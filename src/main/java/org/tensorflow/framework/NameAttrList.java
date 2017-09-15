// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/attr_value.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.NameAttrList}
 *
 * <pre>
 * A list of attr names and their values. The whole list is attached
 * with a string name.  E.g., MatMul[T=float].
 * </pre>
 */
public  final class NameAttrList extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:tensorflow.NameAttrList)
    NameAttrListOrBuilder {
  // Use NameAttrList.newBuilder() to construct.
  private NameAttrList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private NameAttrList() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private NameAttrList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              attr_ = com.google.protobuf.MapField.newMapField(
                  AttrDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, org.tensorflow.framework.AttrValue>
            attr = input.readMessage(
                AttrDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            attr_.getMutableMap().put(attr.getKey(), attr.getValue());
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.AttrValueProtos.internal_static_tensorflow_NameAttrList_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetAttr();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.AttrValueProtos.internal_static_tensorflow_NameAttrList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.NameAttrList.class, org.tensorflow.framework.NameAttrList.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTR_FIELD_NUMBER = 2;
  private static final class AttrDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, org.tensorflow.framework.AttrValue> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, org.tensorflow.framework.AttrValue>newDefaultInstance(
                org.tensorflow.framework.AttrValueProtos.internal_static_tensorflow_NameAttrList_AttrEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                org.tensorflow.framework.AttrValue.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, org.tensorflow.framework.AttrValue> attr_;
  private com.google.protobuf.MapField<java.lang.String, org.tensorflow.framework.AttrValue>
  internalGetAttr() {
    if (attr_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AttrDefaultEntryHolder.defaultEntry);
   }
    return attr_;
  }
  /**
   * <code>map&lt;string, .tensorflow.AttrValue&gt; attr = 2;</code>
   */

  public java.util.Map<java.lang.String, org.tensorflow.framework.AttrValue> getAttr() {
    return internalGetAttr().getMap();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
    }
    for (java.util.Map.Entry<java.lang.String, org.tensorflow.framework.AttrValue> entry
         : internalGetAttr().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, org.tensorflow.framework.AttrValue>
      attr = AttrDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      output.writeMessage(2, attr);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, name_);
    }
    for (java.util.Map.Entry<java.lang.String, org.tensorflow.framework.AttrValue> entry
         : internalGetAttr().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, org.tensorflow.framework.AttrValue>
      attr = AttrDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, attr);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static org.tensorflow.framework.NameAttrList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.NameAttrList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.NameAttrList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.NameAttrList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.NameAttrList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.tensorflow.framework.NameAttrList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.tensorflow.framework.NameAttrList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.tensorflow.framework.NameAttrList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.tensorflow.framework.NameAttrList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.tensorflow.framework.NameAttrList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.framework.NameAttrList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.NameAttrList}
   *
   * <pre>
   * A list of attr names and their values. The whole list is attached
   * with a string name.  E.g., MatMul[T=float].
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.NameAttrList)
      org.tensorflow.framework.NameAttrListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.AttrValueProtos.internal_static_tensorflow_NameAttrList_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetAttr();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableAttr();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.AttrValueProtos.internal_static_tensorflow_NameAttrList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.NameAttrList.class, org.tensorflow.framework.NameAttrList.Builder.class);
    }

    // Construct using org.tensorflow.framework.NameAttrList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      internalGetMutableAttr().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.AttrValueProtos.internal_static_tensorflow_NameAttrList_descriptor;
    }

    public org.tensorflow.framework.NameAttrList getDefaultInstanceForType() {
      return org.tensorflow.framework.NameAttrList.getDefaultInstance();
    }

    public org.tensorflow.framework.NameAttrList build() {
      org.tensorflow.framework.NameAttrList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.framework.NameAttrList buildPartial() {
      org.tensorflow.framework.NameAttrList result = new org.tensorflow.framework.NameAttrList(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      result.attr_ = internalGetAttr();
      result.attr_.makeImmutable();
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.framework.NameAttrList) {
        return mergeFrom((org.tensorflow.framework.NameAttrList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.NameAttrList other) {
      if (other == org.tensorflow.framework.NameAttrList.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      internalGetMutableAttr().mergeFrom(
          other.internalGetAttr());
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.framework.NameAttrList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.NameAttrList) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, org.tensorflow.framework.AttrValue> attr_;
    private com.google.protobuf.MapField<java.lang.String, org.tensorflow.framework.AttrValue>
    internalGetAttr() {
      if (attr_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AttrDefaultEntryHolder.defaultEntry);
     }
      return attr_;
    }
    private com.google.protobuf.MapField<java.lang.String, org.tensorflow.framework.AttrValue>
    internalGetMutableAttr() {
      onChanged();;
      if (attr_ == null) {
        attr_ = com.google.protobuf.MapField.newMapField(
            AttrDefaultEntryHolder.defaultEntry);
      }
      if (!attr_.isMutable()) {
        attr_ = attr_.copy();
      }
      return attr_;
    }
    /**
     * <code>map&lt;string, .tensorflow.AttrValue&gt; attr = 2;</code>
     */
    public java.util.Map<java.lang.String, org.tensorflow.framework.AttrValue> getAttr() {
      return internalGetAttr().getMap();
    }
    /**
     * <code>map&lt;string, .tensorflow.AttrValue&gt; attr = 2;</code>
     */
    public java.util.Map<java.lang.String, org.tensorflow.framework.AttrValue>
    getMutableAttr() {
      return internalGetMutableAttr().getMutableMap();
    }
    /**
     * <code>map&lt;string, .tensorflow.AttrValue&gt; attr = 2;</code>
     */
    public Builder putAllAttr(
        java.util.Map<java.lang.String, org.tensorflow.framework.AttrValue> values) {
      getMutableAttr().putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.NameAttrList)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.NameAttrList)
  private static final org.tensorflow.framework.NameAttrList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.NameAttrList();
  }

  public static org.tensorflow.framework.NameAttrList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NameAttrList>
      PARSER = new com.google.protobuf.AbstractParser<NameAttrList>() {
    public NameAttrList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new NameAttrList(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<NameAttrList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NameAttrList> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.framework.NameAttrList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
