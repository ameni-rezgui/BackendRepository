

package com.sesame.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesame.DAO.Message;

public interface Message_repository extends JpaRepository<Message, Long> {

}
