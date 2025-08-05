package com.taobao.wireless.detail.api;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.clientDomain.TBDetailResultVO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class DetailResponse implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ERR_CODE = "ERR_CODE";
    private static final String FAIL = "FAIL";
    private static final String KEY = "KEY";
    private static final String SHARP = "::";
    private static final String VALUE = "VALUE";
    private TBDetailResultVO data;
    private String[] ret;
    private String retCode;
    private String retMsg;

    static {
        kge.a(-1292213977);
        kge.a(1028243835);
    }

    public TBDetailResultVO getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBDetailResultVO) ipChange.ipc$dispatch("4ee161ee", new Object[]{this}) : this.data;
    }

    public void setData(TBDetailResultVO tBDetailResultVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea367604", new Object[]{this, tBDetailResultVO});
        } else {
            this.data = tBDetailResultVO;
        }
    }

    public String[] getRet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("64c49bc1", new Object[]{this}) : this.ret;
    }

    public void setRet(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923179", new Object[]{this, strArr});
            return;
        }
        this.ret = strArr;
        parserRet(strArr);
    }

    public void parserRet(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c244ef6", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str.indexOf(SHARP) >= 0) {
                    HashMap hashMap = new HashMap();
                    String[] split = str.split(SHARP);
                    if (split != null && split.length > 1) {
                        hashMap.put(KEY, split[0]);
                        hashMap.put(VALUE, split[1]);
                        arrayList.add(hashMap);
                    }
                }
            }
            if (arrayList.size() == 1) {
                Map map = (Map) arrayList.get(0);
                this.retCode = (String) map.get(KEY);
                this.retMsg = (String) map.get(VALUE);
            } else if (arrayList.size() == 2) {
                Map map2 = (Map) arrayList.get(0);
                Map map3 = (Map) arrayList.get(1);
                if (FAIL.equals(map2.get(KEY)) && ERR_CODE.equals(map3.get(KEY))) {
                    this.retCode = (String) map3.get(VALUE);
                    this.retMsg = (String) map2.get(VALUE);
                    return;
                }
                this.retCode = (String) map3.get(KEY);
                this.retMsg = (String) map3.get(VALUE);
            }
        }
    }

    public String getRetCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f243c01", new Object[]{this}) : this.retCode;
    }

    public void setRetCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c66ccfd", new Object[]{this, str});
        } else {
            this.retCode = str;
        }
    }

    public String getRetMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a526aea3", new Object[]{this}) : this.retMsg;
    }

    public void setRetMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f591333", new Object[]{this, str});
        } else {
            this.retMsg = str;
        }
    }
}
