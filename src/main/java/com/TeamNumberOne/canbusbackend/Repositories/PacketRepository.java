package com.TeamNumberOne.canbusbackend.Repositories;

import com.TeamNumberOne.canbusbackend.Model.Packet;
import org.springframework.data.repository.CrudRepository;

public interface PacketRepository extends CrudRepository<Packet, String> {
}
