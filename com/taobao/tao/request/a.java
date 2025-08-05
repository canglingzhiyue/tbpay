package com.taobao.tao.request;

import android.app.Application;
import android.content.Context;
import android.taobao.util.k;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.vmodel.main.c;
import com.taobao.login4android.api.Login;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TaoHelper;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Application mApplication;
    public RemoteBusiness mRemoteBusiness;
    public IRemoteBaseListener mRequestListener;

    static {
        kge.a(-1555127058);
    }

    public a(Application application) {
        this.mApplication = application;
    }

    public void setRemoteBaseListener(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ca8e2", new Object[]{this, iRemoteBaseListener});
        } else {
            this.mRequestListener = iRemoteBaseListener;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mRemoteBusiness = null;
        this.mRequestListener = null;
        this.mApplication = null;
    }

    public void cancelRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8a20bc", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.mRemoteBusiness;
        if (remoteBusiness == null) {
            return;
        }
        remoteBusiness.cancelRequest();
    }

    public boolean isRequestCanceled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11dbc349", new Object[]{this})).booleanValue();
        }
        RemoteBusiness remoteBusiness = this.mRemoteBusiness;
        if (remoteBusiness == null) {
            return true;
        }
        return remoteBusiness.isTaskCanceled();
    }

    public void startRequest(Object obj, int i, Object obj2, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203445ae", new Object[]{this, obj, new Integer(i), obj2, cls});
        } else if (!(obj2 instanceof IMTOPDataObject)) {
        } else {
            BasicRequest basicRequest = (BasicRequest) obj2;
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(basicRequest.getAPI_NAME());
            mtopRequest.setVersion(basicRequest.getVERSION());
            mtopRequest.setNeedEcode(basicRequest.isNEED_ECODE());
            if (basicRequest.getSid() != null) {
                mtopRequest.setNeedSession(true);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sid", (Object) basicRequest.getSid());
                mtopRequest.setData(jSONObject.toString());
            }
            putJson(basicRequest, mtopRequest);
            this.mRemoteBusiness = RemoteBusiness.build((Context) this.mApplication, mtopRequest, TaoHelper.getTTID()).mo1338reqContext(obj).mo1340setBizId(90);
            this.mRemoteBusiness.mo1315setJsonType(JsonTypeEnum.ORIGINALJSON);
            this.mRemoteBusiness.registeListener((IRemoteListener) this.mRequestListener).startRequest(i, cls);
        }
    }

    public void startRequest(Object obj, int i, Object obj2, Class<?> cls, Map<String, Serializable> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8fc417", new Object[]{this, obj, new Integer(i), obj2, cls, map});
        } else if (obj2 instanceof BasicRequest) {
            BasicRequest basicRequest = (BasicRequest) obj2;
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(basicRequest.getAPI_NAME());
            mtopRequest.setVersion(basicRequest.getVERSION());
            mtopRequest.setNeedEcode(basicRequest.isNEED_ECODE());
            mtopRequest.setNeedSession(basicRequest.isNEED_SESSION());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sid", (Object) Login.getSid());
            mtopRequest.setData(jSONObject.toString());
            putJson(basicRequest, mtopRequest);
            if (map != null) {
                JSONObject parseObject = JSONObject.parseObject(mtopRequest.getData());
                for (Map.Entry<String, Serializable> entry : map.entrySet()) {
                    if (entry.getValue() != null) {
                        parseObject.put(entry.getKey(), (Object) entry.getValue().toString());
                    }
                }
                mtopRequest.setData(parseObject.toString());
            }
            this.mRemoteBusiness = RemoteBusiness.build((Context) this.mApplication, mtopRequest, TaoHelper.getTTID()).mo1338reqContext(obj).mo1340setBizId(90);
            this.mRemoteBusiness.mo1315setJsonType(JsonTypeEnum.ORIGINALJSON);
            this.mRemoteBusiness.registeListener((IRemoteListener) this.mRequestListener).startRequest(i, cls);
        }
    }

    private void putJson(BasicRequest basicRequest, MtopRequest mtopRequest) {
        Field[] declaredFields = basicRequest.getClass().getDeclaredFields();
        JSONObject parseObject = JSONObject.parseObject(mtopRequest.getData());
        for (int i = 0; i < declaredFields.length; i++) {
            String name = declaredFields[i].getName();
            Object obj = null;
            if (!c.K_API_VERSION.equalsIgnoreCase(name) && !c.K_API_NAME.equalsIgnoreCase(name) && !"NEED_ECODE".equalsIgnoreCase(name) && name.indexOf("$") == -1 && !"NEED_SESSION".equalsIgnoreCase(name) && !"serialVersionUID".equalsIgnoreCase(name) && !"ORIGINALJSON".equalsIgnoreCase(name)) {
                try {
                    declaredFields[i].setAccessible(true);
                    obj = declaredFields[i].get(basicRequest);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                } catch (SecurityException e3) {
                    e3.printStackTrace();
                }
            }
            if (obj != null) {
                try {
                    parseObject.put(name, obj);
                } catch (Throwable unused) {
                    k.a("ReflectUtil:", "convert() addDataParam exception.");
                }
            }
        }
        mtopRequest.setData(parseObject.toString());
    }

    public static int getRequestType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("858c5f77", new Object[]{str})).intValue();
        }
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
