package tb;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.litecreator.service.ServiceImpl;
import kotlin.Metadata;

@ServiceImpl("com.taobao.android.litecreator.service.impl.AlbumFilmBridge")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lcom/taobao/android/litecreator/sdk/interfaces/IFilmBridge;", "", "open", "", "context", "Landroid/content/Context;", "params", "Lcom/alibaba/fastjson/JSONObject;", "wvCallBackContext", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "openInner", "callBackContext", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface sqi {
    boolean open(Context context, JSONObject jSONObject, WVCallBackContext wVCallBackContext);
}
