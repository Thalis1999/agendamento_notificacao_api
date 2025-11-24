package com.example.agendamento_notificacao_api.business.mapper;

import com.example.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.example.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.example.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import com.example.agendamento_notificacao_api.infrastructure.enums.StatusNotificacaoEnum;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-23T12:06:04-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 25 (Oracle Corporation)"
)
@Component
public class IAgendamentoMapperImpl implements IAgendamentoMapper {

    @Override
    public Agendamento paraEntity(AgendamentoRecord agendamento) {
        if ( agendamento == null ) {
            return null;
        }

        Agendamento.AgendamentoBuilder agendamento1 = Agendamento.builder();

        agendamento1.emailDestinatario( agendamento.emailDestinatario() );
        agendamento1.telefoneDestinatario( agendamento.telefoneDestinatario() );
        agendamento1.dataHoraEnvio( agendamento.dataHoraEnvio() );
        agendamento1.mensagem( agendamento.mensagem() );

        return agendamento1.build();
    }

    @Override
    public AgendamentoRecordOut paraOut(Agendamento agendamento) {
        if ( agendamento == null ) {
            return null;
        }

        Long id = null;
        String emailDestinatario = null;
        String telefoneDestinatario = null;
        String mensagem = null;
        LocalDateTime dataHoraEnvio = null;

        id = agendamento.getId();
        emailDestinatario = agendamento.getEmailDestinatario();
        telefoneDestinatario = agendamento.getTelefoneDestinatario();
        mensagem = agendamento.getMensagem();
        dataHoraEnvio = agendamento.getDataHoraEnvio();

        StatusNotificacaoEnum statusNotificacaoEnum = null;

        AgendamentoRecordOut agendamentoRecordOut = new AgendamentoRecordOut( id, emailDestinatario, telefoneDestinatario, mensagem, dataHoraEnvio, statusNotificacaoEnum );

        return agendamentoRecordOut;
    }
}
