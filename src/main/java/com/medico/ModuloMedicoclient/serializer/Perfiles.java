package com.medico.ModuloMedicoclient.serializer;

public class Perfiles {
  public interface PublicView {}
  public interface FriendsView extends PublicView{}
  public interface Seguimiento extends PublicView {}
  public interface FamilyView extends FriendsView {}
} 
