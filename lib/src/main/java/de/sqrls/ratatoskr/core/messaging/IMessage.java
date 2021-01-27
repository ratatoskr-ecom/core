package de.sqrls.ratatoskr.core.messaging;

import cc.dividebyzero.spring.foundations.IBaseObject;
import de.sqrls.ratatoskr.core.BaseModel;

import java.util.UUID;

public interface IMessage<PAYLOAD extends BaseModel> extends IBaseObject<UUID> {

    PAYLOAD getPayload();

    void setPayload(PAYLOAD payload);


}
