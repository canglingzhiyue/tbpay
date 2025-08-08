package tb;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;

/* loaded from: classes7.dex */
public class krw implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1408877855);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "TaoLiveSearchProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, d dVar) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent.getData() != null) {
            String uri = intent.getData().toString();
            if (!StringUtils.isEmpty(uri) && uri.contains("h5.m.taobao.com/taolive/search.html") && dVar.a() != null) {
                Uri data = intent.getData();
                String queryParameter = data.getQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY);
                if (StringUtils.isEmpty(queryParameter)) {
                    parse = data.buildUpon().appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen").build();
                } else {
                    String uri2 = data.toString();
                    parse = Uri.parse(uri2.replace("largescreenstyle=" + queryParameter, "largescreenstyle=fullscreen"));
                }
                intent.setData(parse);
            }
        }
        return true;
    }
}
