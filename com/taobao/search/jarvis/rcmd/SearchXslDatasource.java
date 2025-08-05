package com.taobao.search.jarvis.rcmd;

import android.text.TextUtils;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import com.taobao.android.searchbaseframe.xsl.refact.XslDataSource;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.search.common.util.ab;
import java.util.Map;
import tb.imn;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public class SearchXslDatasource extends XslDataSource {
    private static final String STORAGE_KEY_VERSION = "version";

    static {
        kge.a(-1301532611);
    }

    public SearchXslDatasource(imn imnVar) {
        super(imnVar);
        registerTemplateLoadListener(new ab());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    /* renamed from: onCreateRequestAdapter */
    public com.taobao.android.searchbaseframe.xsl.module.f mo1220onCreateRequestAdapter() {
        return new e(c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.android.searchbaseframe.xsl.refact.XslDataSource, com.taobao.android.searchbaseframe.xsl.module.XslDatasource
    public void addTppPageParam(Map<String, String> map) {
        super.addTppPageParam(map);
        if (getTotalSearchResult() != 0) {
            String extMod = ((XslSearchResult) getTotalSearchResult()).getExtMod(JarvisConstant.KEY_JARVIS_MODEL_NAME);
            if (TextUtils.isEmpty(extMod)) {
                return;
            }
            String a2 = com.tmall.android.dai.f.a(extMod, "version");
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            map.put(noa.KEY_MODEL_NAME, extMod);
            map.put(noa.KEY_MODEL_VERSION, a2);
        }
    }
}
