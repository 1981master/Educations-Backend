package com.master.oslyOnlineShoping.entity.security;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Roles")
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "role_id")
  private Long id;

  private String name;

  @ManyToMany(mappedBy = "roles")
  private Set<User> users;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(
          name = "role_permission",
          joinColumns = @JoinColumn(name = "role_id"),
          inverseJoinColumns = @JoinColumn(name = "permission_id")
  )
  private Set<Permission> permissions;

  // === Getters and Setters ===
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<User> getUsers() {
    return users;
  }

  public void setUsers(Set<User> users) {
    this.users = users;
  }

  public Set<Permission> getPermissions() {
    return permissions;
  }

  public void setPermissions(Set<Permission> permissions) {
    this.permissions = permissions;
  }
}
