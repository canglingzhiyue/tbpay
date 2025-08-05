package com.hihonor.push.sdk;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.hihonor.push.framework.aidl.DataBuffer;
import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.IPushCallback;
import com.hihonor.push.framework.aidl.MessageCodec;
import com.hihonor.push.framework.aidl.entity.ResponseHeader;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.x;

/* loaded from: classes4.dex */
public class r extends IPushCallback.Stub {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7286a;
    public final al b;

    public r(Object obj, al alVar) {
        this.f7286a = obj;
        this.b = alVar;
    }

    @Override // com.hihonor.push.framework.aidl.IPushCallback
    public void onResult(DataBuffer dataBuffer) throws RemoteException {
        Bundle header = dataBuffer.getHeader();
        Bundle body = dataBuffer.getBody();
        ResponseHeader responseHeader = new ResponseHeader();
        MessageCodec.parseMessageEntity(header, responseHeader);
        Object obj = this.f7286a;
        if (obj instanceof IMessageEntity) {
            MessageCodec.parseMessageEntity(body, (IMessageEntity) obj);
        }
        al alVar = this.b;
        ApiException apiException = new ApiException(responseHeader.getStatusCode(), responseHeader.getStatusMessage());
        Object obj2 = this.f7286a;
        x.b bVar = (x.b) alVar;
        bVar.getClass();
        x xVar = x.c;
        ai<?> aiVar = bVar.f7294a;
        xVar.getClass();
        Handler handler = xVar.f7292a;
        handler.sendMessage(handler.obtainMessage(2, aiVar));
        bVar.f7294a.b(apiException, obj2);
    }
}
