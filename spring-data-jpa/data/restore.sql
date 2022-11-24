INSERT INTO "role" (ID,CREATED_AT,CREATED_BY,IS_DELETE,LAST_MODIFIED_AT,UPDATE_BY,"name") VALUES
	 ('61182db4-2968-4a5c-a7c3-6ff005d78269','2022-11-24 23:09:28.795354','system',false,'2022-11-24 23:09:28.795354','system','ADMIN'),
	 ('e70646ae-61b2-4dff-ac1f-77636a910ee4','2022-11-24 23:09:28.798958','system',false,'2022-11-24 23:09:28.798958','system','USER');

	
INSERT INTO "authorities" (ID,CREATED_AT,CREATED_BY,IS_DELETE,LAST_MODIFIED_AT,UPDATE_BY,"name") VALUES
	 ('8f0154ae-398b-49bc-96e5-0fae8496f123','2022-11-24 23:08:39.771583','system',false,'2022-11-24 23:08:39.771583','system','CREATE'),
	 ('f801fd3e-9396-4ecd-9fa9-04d6eaac5889','2022-11-24 23:08:39.784023','system',false,'2022-11-24 23:08:39.784023','system','READ'),
	 ('6f939427-1152-4d9e-a68e-86830332cde3','2022-11-24 23:08:39.787254','system',false,'2022-11-24 23:08:39.787254','system','UPDATE'),
	 ('5b825c76-412f-49d0-af06-c47701d1d846','2022-11-24 23:08:39.79038','system',false,'2022-11-24 23:08:39.79038','system','DELETE'),
	 ('a63e7c42-def5-4eb8-95ce-7b038864d66b','2022-11-24 23:08:39.793592','system',false,'2022-11-24 23:08:39.793592','system','ALL');

INSERT INTO "roles_authorities" (ROLES_ID,AUTHORITIES_ID) VALUES
	 ('61182db4-2968-4a5c-a7c3-6ff005d78269','8f0154ae-398b-49bc-96e5-0fae8496f123'),
	 ('61182db4-2968-4a5c-a7c3-6ff005d78269','f801fd3e-9396-4ecd-9fa9-04d6eaac5889'),
	 ('61182db4-2968-4a5c-a7c3-6ff005d78269','6f939427-1152-4d9e-a68e-86830332cde3'),
	 ('61182db4-2968-4a5c-a7c3-6ff005d78269','5b825c76-412f-49d0-af06-c47701d1d846'),
	 ('61182db4-2968-4a5c-a7c3-6ff005d78269','a63e7c42-def5-4eb8-95ce-7b038864d66b'),
	 ('e70646ae-61b2-4dff-ac1f-77636a910ee4','8f0154ae-398b-49bc-96e5-0fae8496f123'),
	 ('e70646ae-61b2-4dff-ac1f-77636a910ee4','f801fd3e-9396-4ecd-9fa9-04d6eaac5889'),
	 ('e70646ae-61b2-4dff-ac1f-77636a910ee4','6f939427-1152-4d9e-a68e-86830332cde3'),
	 ('e70646ae-61b2-4dff-ac1f-77636a910ee4','5b825c76-412f-49d0-af06-c47701d1d846');