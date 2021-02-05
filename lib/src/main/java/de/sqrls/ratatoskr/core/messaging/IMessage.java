package de.sqrls.ratatoskr.core.messaging;

import cc.dividebyzero.spring.foundations.IBaseObject;
import de.sqrls.ratatoskr.core.IBaseModel;

import java.util.UUID;

public interface IMessage<PAYLOAD extends IBaseModel> extends IBaseObject<UUID> {

    PAYLOAD getPayload();

    void setPayload(PAYLOAD payload);


}
