// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: costCollegeDaoOne.proto

package example.costCollegeDaoOne.grpc;

/**
 * Protobuf type {@code example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest}
 */
public final class CostCollegeDaoOneRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest)
    CostCollegeDaoOneRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CostCollegeDaoOneRequest.newBuilder() to construct.
  private CostCollegeDaoOneRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CostCollegeDaoOneRequest() {
    state_ = "";
    type_ = "";
    length_ = "";
    expense_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CostCollegeDaoOneRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CostCollegeDaoOneRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            year_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            state_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            length_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            expense_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return example.costCollegeDaoOne.grpc.QueryOne.internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return example.costCollegeDaoOne.grpc.QueryOne.internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest.class, example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest.Builder.class);
  }

  public static final int YEAR_FIELD_NUMBER = 1;
  private int year_;
  /**
   * <code>int32 year = 1;</code>
   * @return The year.
   */
  @java.lang.Override
  public int getYear() {
    return year_;
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object state_;
  /**
   * <code>string state = 2;</code>
   * @return The state.
   */
  @java.lang.Override
  public java.lang.String getState() {
    java.lang.Object ref = state_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      state_ = s;
      return s;
    }
  }
  /**
   * <code>string state = 2;</code>
   * @return The bytes for state.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStateBytes() {
    java.lang.Object ref = state_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      state_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 3;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LENGTH_FIELD_NUMBER = 4;
  private volatile java.lang.Object length_;
  /**
   * <code>string length = 4;</code>
   * @return The length.
   */
  @java.lang.Override
  public java.lang.String getLength() {
    java.lang.Object ref = length_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      length_ = s;
      return s;
    }
  }
  /**
   * <code>string length = 4;</code>
   * @return The bytes for length.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLengthBytes() {
    java.lang.Object ref = length_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      length_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPENSE_FIELD_NUMBER = 5;
  private volatile java.lang.Object expense_;
  /**
   * <code>string expense = 5;</code>
   * @return The expense.
   */
  @java.lang.Override
  public java.lang.String getExpense() {
    java.lang.Object ref = expense_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expense_ = s;
      return s;
    }
  }
  /**
   * <code>string expense = 5;</code>
   * @return The bytes for expense.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExpenseBytes() {
    java.lang.Object ref = expense_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      expense_ = b;
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
    if (year_ != 0) {
      output.writeInt32(1, year_);
    }
    if (!getStateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, state_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
    }
    if (!getLengthBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, length_);
    }
    if (!getExpenseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, expense_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (year_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, year_);
    }
    if (!getStateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, state_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
    }
    if (!getLengthBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, length_);
    }
    if (!getExpenseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, expense_);
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
    if (!(obj instanceof example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest)) {
      return super.equals(obj);
    }
    example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest other = (example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest) obj;

    if (getYear()
        != other.getYear()) return false;
    if (!getState()
        .equals(other.getState())) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (!getLength()
        .equals(other.getLength())) return false;
    if (!getExpense()
        .equals(other.getExpense())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getYear();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + getState().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getLength().hashCode();
    hash = (37 * hash) + EXPENSE_FIELD_NUMBER;
    hash = (53 * hash) + getExpense().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest parseFrom(
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
  public static Builder newBuilder(example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest prototype) {
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
   * Protobuf type {@code example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest)
      example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return example.costCollegeDaoOne.grpc.QueryOne.internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return example.costCollegeDaoOne.grpc.QueryOne.internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest.class, example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest.Builder.class);
    }

    // Construct using example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest.newBuilder()
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
      year_ = 0;

      state_ = "";

      type_ = "";

      length_ = "";

      expense_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return example.costCollegeDaoOne.grpc.QueryOne.internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneRequest_descriptor;
    }

    @java.lang.Override
    public example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest getDefaultInstanceForType() {
      return example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest.getDefaultInstance();
    }

    @java.lang.Override
    public example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest build() {
      example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest buildPartial() {
      example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest result = new example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest(this);
      result.year_ = year_;
      result.state_ = state_;
      result.type_ = type_;
      result.length_ = length_;
      result.expense_ = expense_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest) {
        return mergeFrom((example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest other) {
      if (other == example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest.getDefaultInstance()) return this;
      if (other.getYear() != 0) {
        setYear(other.getYear());
      }
      if (!other.getState().isEmpty()) {
        state_ = other.state_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getLength().isEmpty()) {
        length_ = other.length_;
        onChanged();
      }
      if (!other.getExpense().isEmpty()) {
        expense_ = other.expense_;
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
      example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int year_ ;
    /**
     * <code>int32 year = 1;</code>
     * @return The year.
     */
    @java.lang.Override
    public int getYear() {
      return year_;
    }
    /**
     * <code>int32 year = 1;</code>
     * @param value The year to set.
     * @return This builder for chaining.
     */
    public Builder setYear(int value) {
      
      year_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 year = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearYear() {
      
      year_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object state_ = "";
    /**
     * <code>string state = 2;</code>
     * @return The state.
     */
    public java.lang.String getState() {
      java.lang.Object ref = state_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        state_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string state = 2;</code>
     * @return The bytes for state.
     */
    public com.google.protobuf.ByteString
        getStateBytes() {
      java.lang.Object ref = state_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        state_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string state = 2;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string state = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = getDefaultInstance().getState();
      onChanged();
      return this;
    }
    /**
     * <code>string state = 2;</code>
     * @param value The bytes for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      state_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 3;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 3;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 3;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object length_ = "";
    /**
     * <code>string length = 4;</code>
     * @return The length.
     */
    public java.lang.String getLength() {
      java.lang.Object ref = length_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        length_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string length = 4;</code>
     * @return The bytes for length.
     */
    public com.google.protobuf.ByteString
        getLengthBytes() {
      java.lang.Object ref = length_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        length_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string length = 4;</code>
     * @param value The length to set.
     * @return This builder for chaining.
     */
    public Builder setLength(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      length_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string length = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLength() {
      
      length_ = getDefaultInstance().getLength();
      onChanged();
      return this;
    }
    /**
     * <code>string length = 4;</code>
     * @param value The bytes for length to set.
     * @return This builder for chaining.
     */
    public Builder setLengthBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      length_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object expense_ = "";
    /**
     * <code>string expense = 5;</code>
     * @return The expense.
     */
    public java.lang.String getExpense() {
      java.lang.Object ref = expense_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expense_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string expense = 5;</code>
     * @return The bytes for expense.
     */
    public com.google.protobuf.ByteString
        getExpenseBytes() {
      java.lang.Object ref = expense_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        expense_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string expense = 5;</code>
     * @param value The expense to set.
     * @return This builder for chaining.
     */
    public Builder setExpense(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      expense_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string expense = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpense() {
      
      expense_ = getDefaultInstance().getExpense();
      onChanged();
      return this;
    }
    /**
     * <code>string expense = 5;</code>
     * @param value The bytes for expense to set.
     * @return This builder for chaining.
     */
    public Builder setExpenseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      expense_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest)
  }

  // @@protoc_insertion_point(class_scope:example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest)
  private static final example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest();
  }

  public static example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CostCollegeDaoOneRequest>
      PARSER = new com.google.protobuf.AbstractParser<CostCollegeDaoOneRequest>() {
    @java.lang.Override
    public CostCollegeDaoOneRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CostCollegeDaoOneRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CostCollegeDaoOneRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CostCollegeDaoOneRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

