function DeleteTeacher(id) {
    if (confirm("Êtes-vous sûr de vouloir supprimer cet enseignant ?")) {
        fetch(`/teachers/${id}`, {
            method: 'DELETE'
        })
        .then(response => {
            if (response.ok) {
                // Suppression réussie
                document.getElementById(`teacher-${id}`).remove(); // Retire l'élément du DOM
            } else {
                alert("Erreur lors de la suppression de l'enseignant.");
            }
        })
    }
}
