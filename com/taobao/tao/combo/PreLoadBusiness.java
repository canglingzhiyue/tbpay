package com.taobao.tao.combo;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.combo.dataobject.ComboData;
import com.taobao.tao.combo.dataobject.ComboResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.request.BasicRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class PreLoadBusiness extends com.taobao.tao.request.a implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long mSellerId;

    static {
        kge.a(1946112232);
        kge.a(-525336021);
    }

    public static /* synthetic */ Object ipc$super(PreLoadBusiness preLoadBusiness, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        }
    }

    public PreLoadBusiness(Application application, long j) {
        super(application);
        this.mSellerId = j;
        setRemoteBaseListener(this);
    }

    public long getSellerId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c5a7eeb", new Object[]{this})).longValue() : this.mSellerId;
    }

    public void setSellerId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1cc3d21", new Object[]{this, new Long(j)});
        } else {
            this.mSellerId = j;
        }
    }

    public void startRequest(ArrayList<Long> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ca7c56", new Object[]{this, arrayList});
        } else if (arrayList == null || arrayList.size() <= 0) {
        } else {
            Iterator<Long> it = arrayList.iterator();
            while (it.hasNext()) {
                startRequest(it.next().longValue());
            }
        }
    }

    private void startRequest(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b516770", new Object[]{this, new Long(j)});
        } else if (b.a().a(Long.valueOf(j)) != null) {
        } else {
            BasicRequest basicRequest = new BasicRequest();
            basicRequest.setAPI_NAME("mtop.gebsupport.shop.getMeal");
            basicRequest.setNEED_ECODE(false);
            basicRequest.setNEED_SESSION(true);
            basicRequest.setORIGINALJSON(true);
            basicRequest.setSid(Login.getSid());
            basicRequest.setVERSION("2.0");
            HashMap hashMap = new HashMap();
            hashMap.put("sellerId", Long.valueOf(this.mSellerId));
            hashMap.put("mealId", Long.valueOf(j));
            hashMap.put("needMealIdList", false);
            startRequest(null, 0, basicRequest, ComboResponse.class, hashMap);
        }
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
        } else {
            super.destroy();
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        ComboResponse comboResponse;
        ComboData mo2429getData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (baseOutDo == null || !(baseOutDo instanceof ComboResponse) || (mo2429getData = (comboResponse = (ComboResponse) baseOutDo).mo2429getData()) == null) {
        } else {
            b.a().a(Long.valueOf(mo2429getData.mealId), comboResponse);
        }
    }
}
