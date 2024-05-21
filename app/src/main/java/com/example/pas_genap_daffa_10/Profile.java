package com.example.pas_genap_daffa_10;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.example.pas_genap_daffa_10.R;

public class Profile extends Fragment {

    public Profile() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_profile, container, false);

        // Mendapatkan referensi ke tombol keluar
        View keluarButton = view.findViewById(R.id.keluar_button);

        // Menambahkan listener klik untuk tombol keluar
        keluarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampilkanDialogKonfirmasi();
            }
        });

        return view;
    }

    // Method untuk menampilkan dialog konfirmasi keluar
    private void tampilkanDialogKonfirmasi() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Konfirmasi Keluar");
        builder.setMessage("Apakah Anda yakin ingin keluar?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Keluar aplikasi
                getActivity().finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Batal keluar, tutup dialog
                dialog.dismiss();
            }
        });
        builder.show();
    }
}

