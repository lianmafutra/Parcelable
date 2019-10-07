package com.sunflower.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelMahasiswa implements Parcelable {

    private String nim;
    private String nama;
    private String hobi;
    private String jurusan;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nim);
        dest.writeString(this.nama);
        dest.writeString(this.hobi);
        dest.writeString(this.jurusan);
    }

    public ModelMahasiswa() {
    }

    protected ModelMahasiswa(Parcel in) {
        this.nim = in.readString();
        this.nama = in.readString();
        this.hobi = in.readString();
        this.jurusan = in.readString();
    }

    public static final Parcelable.Creator<ModelMahasiswa> CREATOR = new Parcelable.Creator<ModelMahasiswa>() {
        @Override
        public ModelMahasiswa createFromParcel(Parcel source) {
            return new ModelMahasiswa(source);
        }

        @Override
        public ModelMahasiswa[] newArray(int size) {
            return new ModelMahasiswa[size];
        }
    };
}
