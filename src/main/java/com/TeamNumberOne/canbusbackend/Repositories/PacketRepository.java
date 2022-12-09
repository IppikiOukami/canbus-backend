/**
 * @author Mario Everardo Macias
 * @author Daniel Moreno
 */
package com.TeamNumberOne.canbusbackend.Repositories;

import com.TeamNumberOne.canbusbackend.Model.Packet;
import org.springframework.data.repository.CrudRepository;

/**
 * Helps create temporary table to update without needing to directly query the database
 * Packet is the table it is modifying and String is the data type for the Primary key
 */
public interface PacketRepository extends CrudRepository<Packet, String> {
}
