def members = ["Renzo", "Stefan", "Yonah", "Dror", "Nati", "Alex", "Yogev"]
members.each { member ->
    job("hello-${member}") {
        triggers {
            scm('*/15 * * * *')
        }
        steps {
            shell("echo 'Hello ${member}!'")
        }
    }
}
