package com.taobao.infoflow.core.subservice.biz.experiencecheck.impl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IUserExperienceCheckService;
import tb.kge;
import tb.ldl;
import tb.ljd;
import tb.ljs;

/* loaded from: classes7.dex */
public class UserExperienceCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f17374a = "isCardChecked";
    private b b = null;
    private a c = null;
    private ljs d;

    /* renamed from: com.taobao.infoflow.core.subservice.biz.experiencecheck.impl.UserExperienceCheck$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17375a = new int[IUserExperienceCheckService.CheckOccasion.values().length];

        static {
            try {
                f17375a[IUserExperienceCheckService.CheckOccasion.EXPOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17375a[IUserExperienceCheckService.CheckOccasion.CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum ExperienceError {
        ABNORMAL_TEXT
    }

    static {
        kge.a(1490834779);
    }

    public static /* synthetic */ void b(UserExperienceCheck userExperienceCheck) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfe17f5d", new Object[]{userExperienceCheck});
        }
    }

    public static /* synthetic */ b a(UserExperienceCheck userExperienceCheck) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("30874fbf", new Object[]{userExperienceCheck}) : userExperienceCheck.b;
    }

    public static /* synthetic */ void a(UserExperienceCheck userExperienceCheck, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f06f1564", new Object[]{userExperienceCheck, baseSectionModel});
        } else {
            userExperienceCheck.b(baseSectionModel);
        }
    }

    public UserExperienceCheck(ljs ljsVar) {
        this.d = ljsVar;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("639f56d", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    public void a(BaseSectionModel<?> baseSectionModel, IUserExperienceCheckService.CheckOccasion checkOccasion) {
        b bVar;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11bf77a", new Object[]{this, baseSectionModel, checkOccasion});
        } else if (baseSectionModel == null || (bVar = this.b) == null || !bVar.a() || (ext = baseSectionModel.getExt()) == null || StringUtils.equals("true", ext.getString("isCardChecked"))) {
        } else {
            ext.put("isCardChecked", (Object) "true");
            if (this.c == null) {
                this.c = new a(this, null);
            }
            this.c.a(baseSectionModel, checkOccasion);
            ljd.a().a(this.c);
        }
    }

    private void b(BaseSectionModel<?> baseSectionModel) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a494b1", new Object[]{this, baseSectionModel});
        } else if (baseSectionModel == null || (bVar = this.b) == null || bVar.c() == null) {
        } else {
            String c = this.b.c();
            String string = baseSectionModel.getExt().getString(com.taobao.infoflow.core.subservice.biz.experiencecheck.impl.a.KEY_MAIN_TITLE);
            if (string == null || !string.contains(c)) {
                return;
            }
            a(baseSectionModel, ExperienceError.ABNORMAL_TEXT, string);
        }
    }

    private void a(BaseSectionModel<?> baseSectionModel, ExperienceError experienceError, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d87a874", new Object[]{this, baseSectionModel, experienceError, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorType", (Object) experienceError.toString());
        jSONObject.put("originText", (Object) str);
        JSONObject args = baseSectionModel.getArgs();
        if (args != null) {
            jSONObject.put("recIndex", (Object) args.getString("recIndex"));
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext != null) {
            jSONObject.put("cardFeatureId", (Object) ext.getString("cardFeatureId"));
        }
        ldl.a("Page_Home", 19997, "client_experience_check", "", "", jSONObject.toString());
    }

    public void a(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc98adb0", new Object[]{this, baseSectionModel});
        } else {
            com.taobao.infoflow.core.subservice.biz.experiencecheck.impl.a.a(baseSectionModel);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            ljd.a().e(this.c);
        }
    }

    /* loaded from: classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private BaseSectionModel<?> b;
        private IUserExperienceCheckService.CheckOccasion c;

        static {
            kge.a(-1029473519);
            kge.a(-1390502639);
        }

        private a() {
        }

        public /* synthetic */ a(UserExperienceCheck userExperienceCheck, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (UserExperienceCheck.a(UserExperienceCheck.this) == null) {
            } else {
                String b = UserExperienceCheck.a(UserExperienceCheck.this).b();
                int i = AnonymousClass1.f17375a[this.c.ordinal()];
                if (i == 1) {
                    if (b == null || !b.contains("expose")) {
                        return;
                    }
                    UserExperienceCheck.a(UserExperienceCheck.this, this.b);
                    UserExperienceCheck.b(UserExperienceCheck.this);
                } else if (i != 2 || b == null || !b.contains("click")) {
                } else {
                    UserExperienceCheck.a(UserExperienceCheck.this, this.b);
                    UserExperienceCheck.b(UserExperienceCheck.this);
                }
            }
        }

        public void a(BaseSectionModel<?> baseSectionModel, IUserExperienceCheckService.CheckOccasion checkOccasion) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d11bf77a", new Object[]{this, baseSectionModel, checkOccasion});
                return;
            }
            this.b = baseSectionModel;
            this.c = checkOccasion;
        }
    }
}
