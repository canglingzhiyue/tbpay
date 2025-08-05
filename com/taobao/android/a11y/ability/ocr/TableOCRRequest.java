package com.taobao.android.a11y.ability.ocr;

import com.taobao.android.a11y.ability.common.mtop.A11yMtopRequest;
import tb.kge;

/* loaded from: classes4.dex */
public class TableOCRRequest extends A11yMtopRequest<OCRRequestParams> {
    private static final String API_NAME = "mtop.taobao.a11y.ocr";
    private static final String API_VERSION = "1.0";

    static {
        kge.a(1658283557);
    }

    public TableOCRRequest(OCRRequestParams oCRRequestParams) {
        super(oCRRequestParams);
        setApiName(API_NAME);
        setVersion("1.0");
    }
}
