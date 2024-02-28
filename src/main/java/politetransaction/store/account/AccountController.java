package politetransaction.store.account;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "account")
public interface AccountController {

	@PostMapping("/accounts")
	public ResponseEntity<AccountOut> create(
		@RequestBody(required = true) AccountIn in
	);

	@PostMapping("/accounts/login")
	public ResponseEntity<AccountOut> login(
		@RequestBody(required = true) LoginIn in
	);

	@PutMapping("/accounts/{id}")
	public ResponseEntity<AccountOut> update(
		@PathVariable(required = true) String id,
		@RequestBody(required = true) AccountIn in
	);



}