package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.android.litecreator.service.ServiceImpl;
import com.taobao.taopai.material.bean.MaterialDetail;
import kotlin.Metadata;

@ServiceImpl("com.taobao.android.litecreator.service.impl.MaterialVersionChecker")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u000eJ(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\u000f"}, d2 = {"Lcom/taobao/android/litecreator/sdk/interfaces/IMVersionChecker;", "", "check", "", "activity", "Landroid/content/Context;", "type", "", "paramsObject", "Lcom/alibaba/fastjson/JSONObject;", "checkResult", "Lcom/taobao/android/litecreator/sdk/interfaces/IMVersionChecker$OnCheckResult;", "context", "tid", "OnCheckResult", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface sqj {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\n"}, d2 = {"Lcom/taobao/android/litecreator/sdk/interfaces/IMVersionChecker$OnCheckResult;", "", FactoryType.TYPE_INVALID, "", "detail", "Lcom/taobao/taopai/material/bean/MaterialDetail;", "errorCode", "", "errorMsg", "valid", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public interface a {
        void a(MaterialDetail materialDetail);

        void a(MaterialDetail materialDetail, String str, String str2);
    }

    void check(Context context, int i, JSONObject jSONObject, a aVar);

    void check(Context context, int i, a aVar);
}
