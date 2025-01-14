ALTER TABLE proprietarios
ADD COLUMN qtd_hospedagens INT;

ALTER TABLE alugueis RENAME TO reservas;

ALTER TABLE reservas RENAME COLUMN aluguel_id TO reserva_id;
