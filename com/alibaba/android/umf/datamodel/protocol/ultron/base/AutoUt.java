package com.alibaba.android.umf.datamodel.protocol.ultron.base;

import com.alibaba.android.umf.datamodel.protocol.ultron.BaseProtocol;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class AutoUt extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "arg1")
    private String mArg1;
    @JSONField(name = "arg2")
    private String mArg2;
    @JSONField(name = "arg3")
    private String mArg3;
    @JSONField(name = "args")
    private JSONObject mArgs;
    @JSONField(name = "autoUt")
    private String mAutoUt;
    private String mPageName;

    static {
        kge.a(-1017287274);
    }

    public static /* synthetic */ Object ipc$super(AutoUt autoUt, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean isAutoUt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6de5b303", new Object[]{this})).booleanValue() : Boolean.valueOf(this.mAutoUt).booleanValue();
    }

    public void setAutoUt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148e641", new Object[]{this, str});
        } else {
            this.mAutoUt = str;
        }
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : this.mPageName;
    }

    public void setPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.mPageName = str;
        }
    }

    public String getArg1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("715cfa88", new Object[]{this}) : this.mArg1;
    }

    public void setArg1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec196ee", new Object[]{this, str});
        } else {
            this.mArg1 = str;
        }
    }

    public String getArg2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f7e2b527", new Object[]{this}) : this.mArg2;
    }

    public void setArg2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f3302f", new Object[]{this, str});
        } else {
            this.mArg2 = str;
        }
    }

    public String getArg3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e686fc6", new Object[]{this}) : this.mArg3;
    }

    public void setArg3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e324c970", new Object[]{this, str});
        } else {
            this.mArg3 = str;
        }
    }

    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this}) : this.mArgs;
    }

    public void setArgs(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9679c24a", new Object[]{this, jSONObject});
        } else {
            this.mArgs = jSONObject;
        }
    }

    /* renamed from: clone */
    public AutoUt m148clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoUt) ipChange.ipc$dispatch("d46eef3f", new Object[]{this});
        }
        AutoUt autoUt = (AutoUt) super.clone();
        if (this.mArgs != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.mArgs);
            autoUt.setArgs(jSONObject);
        }
        return autoUt;
    }
}
