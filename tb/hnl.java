package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.service.ServiceImpl;
import kotlin.Metadata;

@ServiceImpl("com.taobao.umipublish.monitor.UmiPublishMonitorImpl")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&JL\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\u000e"}, d2 = {"Lcom/taobao/android/litecreator/sdk/interfaces/IMonitor;", "", "commitInfo", "", "info", "", "location", "data", "Lcom/alibaba/fastjson/JSONObject;", "commitWarning", "errMsg", "errCode", "subErrCode", "errInfo", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface hnl {
    void commitInfo(String str, String str2, JSONObject jSONObject);

    void commitWarning(String str, String str2, String str3, String str4, String str5, JSONObject jSONObject);

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1796457321);
        }

        public static /* synthetic */ void a(hnl hnlVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14873535", new Object[]{hnlVar, str, str2, jSONObject, new Integer(i), obj});
            } else if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: commitInfo");
            } else {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    jSONObject = null;
                }
                hnlVar.commitInfo(str, str2, jSONObject);
            }
        }

        public static /* synthetic */ void a(hnl hnlVar, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32aee393", new Object[]{hnlVar, str, str2, str3, str4, str5, jSONObject, new Integer(i), obj});
            } else if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: commitWarning");
            } else {
                hnlVar.commitWarning(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : jSONObject);
            }
        }
    }
}
