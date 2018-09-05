job('hello-pe-team') {
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        shell('echo "Hello PE team!"')
    }
}
