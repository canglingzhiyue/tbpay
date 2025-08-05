package com.taobao.themis.container.splash.error;

import android.view.View;
import com.taobao.themis.container.splash.entity.ErrorInfo;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/taobao/themis/container/splash/error/IErrorPageWidget;", "", "getView", "Landroid/view/View;", "showErrorInfo", "", "errorInfo", "Lcom/taobao/themis/container/splash/entity/ErrorInfo;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface b {
    View a();

    void a(ErrorInfo errorInfo, f fVar, ITMSPage iTMSPage);
}
