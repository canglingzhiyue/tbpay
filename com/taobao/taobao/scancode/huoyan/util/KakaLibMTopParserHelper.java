package com.taobao.taobao.scancode.huoyan.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopHeaderEvent;
import mtopsdk.mtop.common.MtopProgressEvent;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.MtopConvert;
import tb.kge;
import tb.oxy;

/* loaded from: classes8.dex */
public class KakaLibMTopParserHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(234745781);
    }

    public static <T> ApiID a(Context context, IMTOPDataObject iMTOPDataObject, Class<T> cls, d<T> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("ba23b22f", new Object[]{context, iMTOPDataObject, cls, dVar});
        }
        MtopBuilder a2 = a(context, iMTOPDataObject);
        a2.mo1337addListener(new CustomAsyncDataListener(cls, dVar));
        Versions.isDebug();
        return a2.asyncRequest();
    }

    private static MtopBuilder a(Context context, IMTOPDataObject iMTOPDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("a2228174", new Object[]{context, iMTOPDataObject});
        }
        if (oxy.g()) {
            Mtop instance = Mtop.instance(Mtop.Id.INNER, context);
            MtopConfig mtopConfig = instance.getMtopConfig();
            if (mtopConfig != null) {
                return instance.build(iMTOPDataObject, mtopConfig.ttid);
            }
            return Mtop.instance(context).build(iMTOPDataObject, TaoHelper.getTTID());
        }
        return Mtop.instance(context).build(iMTOPDataObject, TaoHelper.getTTID());
    }

    /* loaded from: classes8.dex */
    public static class CustomAsyncDataListener<T> implements MtopCallback.MtopFinishListener, MtopCallback.MtopHeaderListener, MtopCallback.MtopProgressListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private d<T> requestCallback;
        private Class<T> responseClazz;

        static {
            kge.a(-1009025126);
            kge.a(-520726170);
            kge.a(-1507658996);
            kge.a(-771903738);
        }

        @Override // mtopsdk.mtop.common.MtopCallback.MtopHeaderListener
        public void onHeader(MtopHeaderEvent mtopHeaderEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34d28e9f", new Object[]{this, mtopHeaderEvent, obj});
            }
        }

        public CustomAsyncDataListener(Class<T> cls, d<T> dVar) {
            this.requestCallback = dVar;
            this.responseClazz = cls;
        }

        @Override // mtopsdk.mtop.common.MtopCallback.MtopProgressListener
        public void onDataReceived(MtopProgressEvent mtopProgressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ea8f321", new Object[]{this, mtopProgressEvent, obj});
            } else if (this.requestCallback == null) {
            } else {
                mtopProgressEvent.getDesc();
                mtopProgressEvent.getSize();
                mtopProgressEvent.getTotal();
            }
        }

        @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
        public void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
            d<T> dVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj});
                return;
            }
            MtopResponse mtopResponse = mtopFinishEvent.getMtopResponse();
            if (mtopResponse == null || !mtopResponse.isApiSuccess()) {
                if (mtopResponse == null) {
                    this.requestCallback.a(new KakaLibMTopRequestException("error", "The response is null"));
                    return;
                }
                KakaLibMTopRequestException kakaLibMTopRequestException = new KakaLibMTopRequestException(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                this.requestCallback.a(kakaLibMTopRequestException);
                throw kakaLibMTopRequestException;
            }
            try {
                BaseOutDo mtopResponseToOutputDO = MtopConvert.mtopResponseToOutputDO(mtopResponse, this.responseClazz);
                if (mtopResponseToOutputDO != null && (dVar = this.requestCallback) != null) {
                    dVar.a(mtopResponseToOutputDO, null);
                    return;
                }
                d<T> dVar2 = this.requestCallback;
                if (dVar2 == null) {
                    return;
                }
                dVar2.a(new KakaLibMTopRequestException("error", "The reponse data is null"));
            } catch (ClassCastException e) {
                this.requestCallback.a(e);
            }
        }
    }
}
