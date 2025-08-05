package com.taobao.umipublish.draft;

import com.taobao.taobao.R;
import java.util.Collection;
import tb.kge;

/* loaded from: classes9.dex */
public interface c {
    DraftModel a(String str, String str2, String str3);

    a a(String str, String str2, DraftModel draftModel);

    void a();

    a b(String str, String str2, Collection<String> collection);

    Collection<DraftModel> b(String str, String str2);

    DraftModel c(String str, String str2);

    a d(String str, String str2);

    /* loaded from: classes9.dex */
    public static class a {
        public static final String ERROR_CODE_DRAFT_DELETE_FAILED = "105";
        public static final String ERROR_CODE_DRAFT_LIMIT = "103";
        public static final String ERROR_CODE_DRAFT_MOVE_FAILED = "106";
        public static final String ERROR_CODE_DRAFT_SAVE_FAILED = "104";
        public static final String ERROR_CODE_INVALID_PAGE = "101";
        public static final String ERROR_CODE_INVALID_PARAM = "102";
        public static final String ERROR_MSG_DRAFT_DELETE_FAILED;
        public static final String ERROR_MSG_DRAFT_LIMIT;
        public static final String ERROR_MSG_DRAFT_MOVE_FAILED;
        public static final String ERROR_MSG_DRAFT_SAVE_FAILED;
        public static final String ERROR_MSG_INVALID_PAGE;
        public static final String ERROR_MSG_INVALID_PARAM;

        /* renamed from: a  reason: collision with root package name */
        public DraftModel f23241a;
        public int b;
        public boolean c;
        public String d;
        public String e;

        static {
            kge.a(-188144661);
            ERROR_MSG_INVALID_PAGE = com.alibaba.ability.localization.b.a(R.string.gg_pub_invalid_page_exclamation);
            ERROR_MSG_INVALID_PARAM = com.alibaba.ability.localization.b.a(R.string.gg_pub_invalid_parameter);
            ERROR_MSG_DRAFT_LIMIT = com.alibaba.ability.localization.b.a(R.string.gg_pub_draft_limit_reached);
            ERROR_MSG_DRAFT_SAVE_FAILED = com.alibaba.ability.localization.b.a(R.string.gg_pub_draft_save_failed);
            ERROR_MSG_DRAFT_DELETE_FAILED = com.alibaba.ability.localization.b.a(R.string.gg_pub_draft_delete_failed);
            ERROR_MSG_DRAFT_MOVE_FAILED = com.alibaba.ability.localization.b.a(R.string.gg_pub_draft_transfer_failed);
        }

        public a(boolean z) {
            this.c = z;
        }

        public a(DraftModel draftModel, int i) {
            this.f23241a = draftModel;
            this.b = i;
            this.c = draftModel != null;
        }

        public a(String str, String str2) {
            this.f23241a = null;
            this.c = false;
            this.d = str;
            this.e = str2;
        }
    }
}
