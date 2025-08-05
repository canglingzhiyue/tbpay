package android.support.design.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.view.menu.g;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o;

/* loaded from: classes2.dex */
public class BottomNavigationPresenter implements j {

    /* renamed from: a  reason: collision with root package name */
    private android.support.v7.view.menu.e f1139a;
    private BottomNavigationMenuView b;
    private boolean c = false;
    private int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.design.internal.BottomNavigationPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int selectedItemId;

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.selectedItemId = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
        }
    }

    public void a(int i) {
        this.d = i;
    }

    public void a(BottomNavigationMenuView bottomNavigationMenuView) {
        this.b = bottomNavigationMenuView;
    }

    public void a(boolean z) {
        this.c = z;
    }

    @Override // android.support.v7.view.menu.j
    public boolean collapseItemActionView(android.support.v7.view.menu.e eVar, g gVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public boolean expandItemActionView(android.support.v7.view.menu.e eVar, g gVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public boolean flagActionItems() {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public int getId() {
        return this.d;
    }

    @Override // android.support.v7.view.menu.j
    public void initForMenu(Context context, android.support.v7.view.menu.e eVar) {
        this.b.initialize(this.f1139a);
        this.f1139a = eVar;
    }

    @Override // android.support.v7.view.menu.j
    public void onCloseMenu(android.support.v7.view.menu.e eVar, boolean z) {
    }

    @Override // android.support.v7.view.menu.j
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.b.tryRestoreSelectedItemId(((SavedState) parcelable).selectedItemId);
        }
    }

    @Override // android.support.v7.view.menu.j
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.b.getSelectedItemId();
        return savedState;
    }

    @Override // android.support.v7.view.menu.j
    public boolean onSubMenuSelected(o oVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public void setCallback(j.a aVar) {
    }

    @Override // android.support.v7.view.menu.j
    public void updateMenuView(boolean z) {
        if (this.c) {
            return;
        }
        if (z) {
            this.b.buildMenuView();
        } else {
            this.b.updateMenuView();
        }
    }
}
