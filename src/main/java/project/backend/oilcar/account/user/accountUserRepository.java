package project.backend.oilcar.account.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface accountUserRepository extends JpaRepository<accountUserEntity, Long>{
	 public accountUserEntity findOneByUsername(String Username);
}
