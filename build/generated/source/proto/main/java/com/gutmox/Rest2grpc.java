// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rest2grpc.proto

package com.gutmox;

public final class Rest2grpc {
  private Rest2grpc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gutmox_Rest2grpcRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gutmox_Rest2grpcRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gutmox_Rest2grpcReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gutmox_Rest2grpcReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017rest2grpc.proto\022\ncom.gutmox\" \n\020Rest2gr" +
      "pcRequest\022\014\n\004name\030\001 \001(\t\"!\n\016Rest2grpcRepl" +
      "y\022\017\n\007message\030\001 \001(\t2V\n\020Rest2grpcService\022B" +
      "\n\004send\022\034.com.gutmox.Rest2grpcRequest\032\032.c" +
      "om.gutmox.Rest2grpcReply\"\000B\037\n\ncom.gutmox" +
      "B\tRest2grpcP\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_gutmox_Rest2grpcRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_gutmox_Rest2grpcRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gutmox_Rest2grpcRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_gutmox_Rest2grpcReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_gutmox_Rest2grpcReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gutmox_Rest2grpcReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
