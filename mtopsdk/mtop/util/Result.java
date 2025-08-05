package mtopsdk.mtop.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class Result<T> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 8852253200756618077L;
    public String errCode;
    public String errInfo;
    public String errType;
    public T model;
    public int statusCode;
    public boolean success;

    static {
        kge.a(1005361184);
        kge.a(1028243835);
    }

    public Result(T t) {
        this.success = true;
        this.model = t;
    }

    public Result() {
        this.success = true;
    }

    public Result(boolean z, String str, String str2) {
        this(z, null, str, str2);
    }

    public Result(boolean z, String str, String str2, String str3) {
        this.success = true;
        this.success = z;
        this.errType = str;
        this.errCode = str2;
        this.errInfo = str3;
    }

    public T getModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("b4c825f8", new Object[]{this}) : this.model;
    }

    public void setModel(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92cc54a", new Object[]{this, t});
        } else {
            this.model = t;
        }
    }

    public String getErrCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49f20fbd", new Object[]{this}) : this.errCode;
    }

    public void setErrCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5370c1", new Object[]{this, str});
        } else {
            this.errCode = str;
        }
    }

    public String getErrInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3caecb9c", new Object[]{this}) : this.errInfo;
    }

    public void setErrInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602e30c2", new Object[]{this, str});
        } else {
            this.errInfo = str;
        }
    }

    public String getErrType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6389f090", new Object[]{this}) : this.errType;
    }

    public void setErrType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b7aa4e", new Object[]{this, str});
        } else {
            this.errType = str;
        }
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : this.success;
    }

    public void setSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.success = z;
        }
    }

    public int getStatusCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue() : this.statusCode;
    }

    public void setStatusCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86008fb", new Object[]{this, new Integer(i)});
        } else {
            this.statusCode = i;
        }
    }
}
